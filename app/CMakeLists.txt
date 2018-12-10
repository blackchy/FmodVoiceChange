# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.
#-----------------------------------------
find_library( log-lib
              log )

set(my_lib_path ${CMAKE_SOURCE_DIR}/libs)

# 添加三方的so库
add_library(libfmod
            SHARED
            IMPORTED )

 # 指名第三方库的绝对路径
 set_target_properties( libfmod
                        PROPERTIES IMPORTED_LOCATION
                        ${my_lib_path}/${ANDROID_ABI}/libfmod.so )

 add_library(libfmodL
             SHARED
             IMPORTED )

 set_target_properties( libfmodL
                        PROPERTIES IMPORTED_LOCATION
                        ${my_lib_path}/${ANDROID_ABI}/libfmodL.so )

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

#--------------------------------
add_library( # Sets the name of the library.
             changeVoice

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/native-lib.cpp )

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.



# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

#---------------------
# 导入路径，为了让编译时能够寻找到这个文件夹
include_directories(src/main/cpp/inc)

# 链接好三个路径
target_link_libraries( changeVoice
                       libfmod
                       libfmodL

                       ${log-lib} )