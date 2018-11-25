# BeautifulToast
Simple Custom Android library that creates Beautiful Looking Toasts

**Step 1. Add the JitPack repository to your build file**

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
**Step 2. Add the dependency**

dependencies {
	        implementation 'com.github.paulfranco:BeautifulToast:0.1.1'
	}

![how to](https://user-images.githubusercontent.com/29502126/48974268-90877080-f008-11e8-99b1-194434821068.png)

[![](https://jitpack.io/v/paulfranco/BeautifulToast.svg)](https://jitpack.io/#paulfranco/BeautifulToast)

## Example

public void successToast(View view) {

	new SuccessToast(this, "Success Toast!!");
}
	
## ScreenShots

![successtoast](https://user-images.githubusercontent.com/29502126/48974274-cfb5c180-f008-11e8-987d-c572b1efa9ad.png)
![informationtoast](https://user-images.githubusercontent.com/29502126/48974275-d3e1df00-f008-11e8-871a-85d97ba322b4.png)
![failed toast](https://user-images.githubusercontent.com/29502126/48974276-d6dccf80-f008-11e8-8f57-8541bf280164.png)

## Video

https://youtu.be/k2FxKe7YfAQ
