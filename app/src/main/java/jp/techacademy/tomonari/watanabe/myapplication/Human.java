package jp.techacademy.tomonari.watanabe.myapplication;

import android.util.Log;

/**
 * Created by moggmogg on 2016/08/09.
 */
class Human extends Animal implements thinkable {

    String hobby;


    public Human(String name, int age, String hobby){  //コンストラクタ：呼び出されたときに実行されるメソッドのこと
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest","名前は" + this.name + "です。年は" + this.age + "歳です。");

    }

    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}
