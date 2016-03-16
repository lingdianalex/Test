package com.wangsy.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.wangsy.baselibrary.util.StringUtil;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"以后开发调试过程要会使用log来调试应用，log是调试的一种方式，还有一种是使用debug模式启动应用通过常用的断电调试程序，这种好处在于在" +
                "在程序运行期你能够看到代码中各种变量等的实时值");

        String a ="mac的快捷键不一样，现在给你演示使用debug模式,你需要熟悉下这几个按钮是怎么调试的 ，可以在开发过程试试就行  一般就是逐行，进入方法，跳出方法，执行到下个断点，ok这就是debug调试";
//目前呢，先不用学习gradle的配置之类  ，先写代码就行，等代码写完可以运行了  再说gradle的配置
        //写界面时候务必不要拖拽空间，不是个明智的操作
        if (StringUtil.isNotNull(a)){
            Toast.makeText(this,a,Toast.LENGTH_LONG).show();
        }

    }
}
