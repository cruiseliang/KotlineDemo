package yuan.com.kotlinedemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

/**
 * Created by Liang on 2018/9/4 0004.
 * kotline语法
 * https://blog.csdn.net/cenzr/article/details/72674849 kotline资料网址
 */
class KotlineActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about);
        btn_sum.setText("sum++")
        btn_sum.text = "sum--"
        sum(3, 6)
        var intent = Intent(this, MainActivity::class.java) //需要用::来使用Java类，注意是两个“”
    }

    //1.使用插件kotlin-android-extensions，可以直接使用id，代替控件使用
    //2.在kotlin语法里，代码行不需要“;”结尾
    //3.:冒号使用广泛：定义变量 函数返回值 参数类型 声明类/接口的继承
    fun makeTool(id: Int) {} //参数id为Int类型

    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    var name: String = "my name" //变量name为String类型
    //4.没有new   kotlin来实例化一个对象不需要new
    var list = ArrayList()
    //5.用var定义变量
    var namse: String = "names"
    //6.用val定义常量用val定义常量(相当于final)
    val TAG: String = "classname"
    //7.初始化和延迟加载
    //8空指针安全:在kotlin里可以用“?”表示可以为空 用“!!”表示不可以为空
    var num: Int? = null
    val v1 = num?.toInt() //不做处理返回 null

    val v2 = num?.toInt() ?: 0 //判断为空时返回0

    val v3 = num!!.toInt() //抛出空指针异常（用“!!”表示不能为空）
    //9.函数：kotlin可以对函数的返回值进行类型推断，所以经常使用“=”代替返回类型和“return”关键字
    fun getNama() = {
        "dddd"//return被=替代了

    }

    /**
     * 函数只有一行代码
     */
    fun getName() = getNama()//return被=替代了




}