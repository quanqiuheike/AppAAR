# AppAAR

如何获取AAR:?
1，可以通过AS的gradle，双击当前module下的Tasks--->build--->assembleRelease  
2，通过将当前的module作为library，被另外的为application的module依赖，rebuild project 则会生成debug和release下的aar，复制即可

注意：作为library不能使用swtich  case判断当前的Id,因为非final 修饰的，所以全部修改为if else ,AS中存在此快捷键
----------------------------------------------------------------------------------------------------

repositories {
    jcenter()
    flatDir {
//            dirs 'libs', '../wanDa_SGQMS_Trunck/libs'
//            dirs project(':aarlibrary').file('libs')
        dirs 'libs'//依赖于libs下的包
    }

}
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:appcompat-v7:25.3.1'
    compile 'com.android.support.constraint:constraint-layout:1.0.2'
    testCompile 'junit:junit:4.12'
    //哪个module都引用了library，都进行此配置，并在libs下面存放该名字的aar
    compile(name: 'a2-release', ext: 'aar')
    compile(name: 'a3-release', ext: 'aar')
    compile(name: 'a4-release', ext: 'aar')
}

//如果还是不能识别当前的Activity，可以参考下External Libraries找到当前的aar,点开看是否存在当前的Activity


-------------------------------------------------------------------------------------------------------------
# Jar
同理如何获取AS中的Jar包





gralde 中打Jar包








