# RvScrollAnimation


Recyclerview Scroll animation -android is an Android Library to build RvScrollAnimation like Down to up scroll,up to down scroll,Right to left and left to right scroll of rv item, custom Animation etc.

<img src="https://github.com/premsingh8171/RvScrollAnimation/blob/master/app/src/main/res/drawable/down_to_top.gif" width="300" height="550" /><img src="https://raw.githubusercontent.com/premsingh8171/RvScrollAnimation/master/app/src/main/res/drawable/left_to_right.gif" width="300" height="550" /><img src="https://github.com/premsingh8171/RvScrollAnimation/blob/master/app/src/main/res/drawable/right_to_left.gif" width="300" height="550" /><img src="https://github.com/premsingh8171/RvScrollAnimation/blob/master/app/src/main/res/drawable/top_to_down.gif" width="300" height="550" />

## Installation

-  Add the following to your project level `build.gradle`:
 
```gradle
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
  -  Add this to your app `build.gradle`:
 
```gradle
dependencies {
      
      implementation 'com.github.premsingh8171:RvScrollAnimation:1.0.0'

}
```

## Using Recyclerview Adapter

```java

@Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ansFaqs.setText(data.get(position));
        //here we callback rvScrollAnimation
        //rvScrollAnimation.scrollDownToTop(mContext, holder.crd);
        // rvScrollAnimation.scrollTopToDown(mContext, holder.crd);
        //  rvScrollAnimation.scrollLeftToRight(mContext, holder.crd);
        rvScrollAnimation.scrollrightToLeft(mContext, holder.crd);


    }
```

## With variable

  -  Initialize variable:
```java
 RvScrollAnimation rvScrollAnimation;


 public MainAdapter(Context mContext, ArrayList<String> data) {
        this.mContext = mContext;
        this.data = data;
        this.rvScrollAnimation = new RvScrollAnimation();
    }
```
## update feature

Function      				   | description
-------------------------------------------| -------------
.scrollLeftToRight()  | LEFT TO RIGHT ANIMATION
.scrollrightToLeft()  | RIGHT TO LEFT ANIMATION
.scrollTopToDown()    | TOP TO DOWN ANIMATION
.scrollDownToTop()    | DOWN TO TOP ANIMATION




<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>

