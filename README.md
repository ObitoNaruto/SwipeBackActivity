# SwipeBackActivity
A gesture activity support sliding back to the right!

----

[ ![Download](https://api.bintray.com/packages/sunzxyong/maven/SwipeBackActivity/images/download.svg) ](https://bintray.com/sunzxyong/maven/SwipeBackActivity/_latestVersion)

## 简介

原理是在DecorView与LinearLayout之间再加一层DragLayout，然后使用ViewDragHelper处理这个DragLayout。

## 使用
**Maven**:

```java
<dependency>
  <groupId>com.sunzxy.lib</groupId>
  <artifactId>swipeback</artifactId>
  <version>1.3.0</version>
  <type>pom</type>
</dependency>
```
**Gradle**:

```java
compile 'com.sunzxy.lib:swipeback:1.3.0'
```

其中需要在style中将需要侧滑的界面背景设为透明，否则将看到的是黑色背景看不到下一层的Activity

```
    <item name="android:windowIsTranslucent">true</item>
```

新建一个BaseActivity继承于SwipeBackActivity，并后续Activity继承于BaseActivity即可。

默认全部Activity开始侧滑,需禁用侧滑可以使用:


```
    setSwipeBackEnabled(false);
```

滑动过程中的事件你可使用SwipeLayoutListener监听:

```
public interface SwipeLayoutListener {

    void onViewFlingPercent(float flingPercent);//回调滑动的百分比

    void onEdgeTouched();//触摸边缘并没有拖动时回调

    void onEdgeDragStarted();//开始拖动时回调

    void onViewReleased(View releasedView);//抬起时回调

    void onViewFlingOver();//达到finish状态时回调
}

```
## 引用
参考自[ikew0ng的返回库传送门](https://github.com/ikew0ng/SwipeBackLayout)，感谢！！！在此库中做了许多修改、处理了右滑时事件的冲突、没有重写ViewPager，并精简了许多代码，gif见art目录

