package jp.techacademy.tomonari.watanabe.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human = new Human("渡辺", 29, "趣味");    //Humanのインスタンスを作る。（名前.年,趣味）の順

        human.say();

        human.think();

        Human human2 = new Human("ふー太郎", 5, "昼寝");

        human2.say();

        human2.think();

    }
}
