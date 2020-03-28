# JAVA study week 1-1

## 安裝
在 MAC OS 上面本身就有 JAVA language, 但是要能夠使用 JAVA 開發, 必須安裝 JDK, [Java SE Development Kit](https://docs.oracle.com/javase/8/docs/index.html).

> 如果你安裝JDK，就會安裝上述連結全部的東西，而 Java Language 只是連結圖最上面一小部份。
> reference: [https://openhome.cc/Gossip/Java/JVM-JRE-JDK.html](https://openhome.cc/Gossip/Java/JVM-JRE-JDK.html)
> 

MAC OS 的 JDK 安裝教學, 請[參考這裡](https://mkyong.com/java/how-to-install-java-on-mac-osx/)

使用 homebrew 安裝 JDK 會直接安裝並取代 /Library/Java/JavaVirtualMachines 路徑, 請確定在安裝的時候你 termianl 的工作路徑不是停留在這個位置, 不然安裝完成後你停留的工作路徑資料夾會被整個取代, 此時會停留在一個不存在的資料夾, 除非你離開此路徑再重新進來, 不然執行 java -version 指令的時候會出現下面錯誤:
```
Error: The current working directory doesn't exist, cannot proceed.
```

## 教程

[作者本人網站](https://marcus-biel.com/java-beginner-course/), 將教材分段落上傳並且提供文字敘述, 相對原本的九小時影片, 這個網站更適合新手.

### package
會放在每一份 script 的最上方, 類似資料夾管理結構, 下面這段程式碼則定義這一份 script 屬於 jc.javacourse.lesson2, 在 java 編譯完 script 後會放在 jc/javacourse/lesson2 這個資料夾下.
```
package jc.javacourse.lesson2;
```
Reference: [https://caterpillar.gitbooks.io/javase6tutorial/content/c9_2.html](https://caterpillar.gitbooks.io/javase6tutorial/content/c9_2.html)

### import
把 package 引用近來使用, 下面這段代表從 org.junit.jupiter.api 引用 Test class, import 找的順序會先從 local package 找, 如果找不到就會去 External Libraries 找, 沒有的話就會去網路上下載到 External Libraries (有點類似 npm) 再引用.
```
import org.junit.jupiter.api.Test;
```
Reference: [https://caterpillar.gitbooks.io/javase6tutorial/content/c9_2.html](https://caterpillar.gitbooks.io/javase6tutorial/content/c9_2.html)

### Access Modifier
定義一個物件, 變數, 可以被調用的範圍, 可能是 class, 也可能是 package...

[Access Modifier / 非 Access Modifier 的修飾詞 - 1](https://ithelp.ithome.com.tw/articles/10158077)

[Access Modifier / 非 Access Modifier 的修飾詞 - 2](https://dotblogs.com.tw/brian/2013/07/17/111276)


## 遇到的問題
使用 intellij idea 的時候遇到下面問題:

### .java 檔沒有被認定是 JAVA class
開始寫程式的時候, 有些 code completion 的功能沒有像影片上那樣正常運作, 後來才發現自己的 .java 檔沒有被 IDE 認定是 JAVA class, 而原因是我的 java folder 沒有被設定成 resource root, 可以點擊右鍵後選擇 mark directory as, 選擇 resource root, 設定完之後 java folder 會變成 藍色的. 選擇 test resource root 會變成綠色的. 然後底下的 .java 檔就可以自動被認定成 JAVA class, 也可以新增新的 JAVA class 檔嘍.

### 找不到 org.junit 的 package
把檔案轉成 JAVA class 後, IDE 就會幫 import 自動尋找 package, 可是因為找不到同影片上的 org.junit, 所以取而代之使用看起來很像的 org.junit.jupiter.api

