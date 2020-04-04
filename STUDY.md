# JAVA study week 1

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

**Access modifiers**
四種主要的 Access modifiers: 
* public
可以被其他 class 調用的 method/variable/class.
* private
只能被宣告時所在的 class 調用的 method/variable/class, 儘量讓 class 裡面的 variable 是 private 的, 不然很容易讓別的 class 不小心修改到. 
如果只想讓別的 class 取用 private variable, 可以另外宣告一個 public method 去 return class 內的 private variable.
* default
只有在沒有定義任何
其他類型的 modifier 時候就預設定義的, 所以稱作 default, 他可以被在被宣告的同一個 package 的所有其他 class 調用, 所以又稱 package-private modifier, 這種 modifier 很少被使用到
* protected
與繼承行為相關, 暫時不討論.

**non - Access modifiers**
有很多種 non - Access modifiers:
* static
讓同一個 class 所 instance 的所有 objects 都共享 (有點像是 javascript 的全域變數)的 methods/variables, 不會因為是不同的 object 就有不同的 methods/variables.
* final
一旦被指定成 final 變數, 則只能被讀取, 無法再被更改, 通常會跟 static 搭配使用.


### Constructor
一個 class 內可以定義多個 Constructors, 也可以完全不定義 Constructor, 在 compiler 的時候, 如果程式碼完全沒有定義任何 Constructor, 會自動幫忙定義一個沒有任何 parameter 的 default constructor, 其意義同下: 
```
public class Person {

    public Person() {
       /*
         default constructor, required by Hibernate
       */
    }

}
```
但是上面這種寫法, 通常就不會叫做 default constructor (可是意義是一樣的).
當已經有自行定義 Constructor 後, compiler 就不會自動幫你加上 default constructor, 所以建議每次在寫新的 Class 的時候, 都要自己建立一個 default constructor.

### JAVA 的 garbage collection
當沒有指標指向變數記憶體空間的時候就會被回收

### Maven
JAVA 的專案管理套件, 其中最重要的是 build code(有點像 javascript 的 webpack or rollup) 把專案打包成單一的 script, 管理專案的 script and folder 的架構, 以及管理 dependencies, 在引入 maven 後資料夾的根目錄會出現一個叫 pom.xml 的 maven 設定檔.

其設定方式可以透過 intelliJ IDEA 使用 UI 把專案 maven module 引入專案, 也可以直接下載 maven 透過 cli 來執行上述動作.

reference:
[import maven by intelliJ - 1](https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html)
[import maven by intelliJ - 2](https://www.jetbrains.com/help/idea/maven-support.html)
[import maven by intelliJ - 3](https://www.jetbrains.com/help/idea/troubleshooting-common-maven-issues.html)
[import maven by cli](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

### SLF4J
java 常用的 logger, 他的前身是 logback, 可以在 maven 的 pom.xml 設定 dependencies:
```
<dependency>
     <groupId>org.slf4j</groupId>
     <artifactId>slf4j-api</artifactId>
     <version>1.7.5</version>
</dependency>
<dependency>
     <groupId>ch.qos.logback</groupId>
     <artifactId>logback-core</artifactId>
     <version>1.0.13</version>
</dependency>
<dependency>
     <groupId>ch.qos.logback</groupId>
     <artifactId>logback-classic</artifactId>
     <version>1.0.13</version>
</dependency>
```

可以看到有使用到一些 logback 的 dependencies. 在 maven import SLF4J 相關 dependencies 後, 要在 src/main/resources 資料夾地下建立 logback.xml 檔案, 用來當作 SLF4J 的 config file, 標準格式如下:
```
<?xml version="1.0" encoding="UTF-8"?>
<configuration debug="true">
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{35} - %msg %n
            </pattern>
        </encoder>
    </appender>

    <logger name="jc.javacourse.lesson12" level="debug"/>

    <root level="INFO">
        <appender-ref ref="STDOUT" />
    </root>
</configuration>
```
最重要的要注意三個地方:
* appender: 
用來決定 log 要輸出的地方, 這裡設定成 ConsoleAppender, 代表 log 會直接從 terminal 的 console 印出來, 還可以使用 email, DB, file... 設定方法可以參考 [appender](http://logback.qos.ch/manual/appenders.html)

* root: 
level 決定要顯示那一個 log level 的 log, 上層 level 可以顯下層 level 的 log, 例如 debug 可以顯示 debug, info, error, warn, 而 info 可以顯示 info, error, warn.
root 的設定會套用到整個 project, 而如果想要針對某一個 package 有不同的 log level 設定, 可以在 logger 設定.

* logger:
name 決定要對哪一個 package 覆蓋 root 的設定, 上面範例就針對 jc.javacourse.lesson12 package 使用 debug level 的 log. 而其他 packages 會使用 root 設定的 info level log.

### Compare two objects
可以使用運算子 == 或是 euqals, equals 比較的是兩個 objects 的內容有沒有相同, == 比較的是兩個 objects 的記憶體位址有沒有相同.

> string 屬於 object, 不是 primitive valuse(e.g int...)
> 
一般來說, 在比較 string variable 是否等於某一個 constant string 的時候, 我們會使用 equals, 而且會用 constant string, 的 equals method, 而不是 string variable 的 equal method, 如下:
```
"PENDING".equals(state)
```

因為 state 這個變數有可能在某一個地方被 assigned 成 null, null 就沒有 equals method,  不過我們可以確保 "PENDING" string 一定不會是 null 而且一定有 equals method.

Reference: [https://www.geeksforgeeks.org/difference-equals-method-java/](https://www.geeksforgeeks.org/difference-equals-method-java/)


## enum
### 好處
enum 裡面定義的 value 不能再被改變, 而且是 iterable, 而 array 雖然被定義成 final 之後有不可以被改變的特性, 但是那也只有 array 本身不會被替換, 不能防止 array 內部的 item (reference) 被改掉.
### 比較
enum 裡面的值都是 constant (沒有 reference), 只要是在同一個 enum 裡面的 items 都可以互相用 == 或是 equals 來比較.

## 遇到的問題
使用 intellij idea 的時候遇到下面問題:

### .java 檔沒有被認定是 JAVA class
開始寫程式的時候, 有些 code completion 的功能沒有像影片上那樣正常運作, 後來才發現自己的 .java 檔沒有被 IDE 認定是 JAVA class, 而原因是我的 java folder 沒有被設定成 resource root, 可以點擊右鍵後選擇 mark directory as, 選擇 resource root, 設定完之後 java folder 會變成 藍色的. 選擇 test resource root 會變成綠色的. 然後底下的 .java 檔就可以自動被認定成 JAVA class, 也可以新增新的 JAVA class 檔嘍.

### 找不到 org.junit 的 package
把檔案轉成 JAVA class 後, IDE 就會幫 import 自動尋找 package, 可是因為找不到同影片上的 org.junit, 所以取而代之使用看起來很像的 org.junit.jupiter.api

