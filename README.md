# SwipeBackActivity
A gesture activity support sliding back to the right!

----
## 简介
这是基于另外一个右滑返回库修改后的[ikew0ng的返回库传送门](https://github.com/ikew0ng/SwipeBackLayout)，感谢！！！我在此库中做了一些修改和处理了右滑时事件的冲突，并精简了许多代码，gif见art目录

原理是在DecorView与LinearLayout之间再加一层DragLayout，然后使用ViewDragHelper处理这个DragLayout。

## 使用
**Maven**:

```java
<dependency>
  <groupId>com.sunzxy.lib</groupId>
  <artifactId>swipeback</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
**Gradle**:

```java
compile 'com.sunzxy.lib:swipeback:1.0.0'
```

其中需要在style中当前界面的背景设为透明，否则将看到的是黑色背景看不到下一层的Activity

```
    <item name="android:windowIsTranslucent">true</item>
```

新建一个BaseActivity继承于SwipeBackActivity，并后续Activity继承于BaseActivity即可。

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


