package com.byteflyer.designpatternforjava.functions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.byteflyer.designpatternforjava.R;
import com.byteflyer.designpatternforjava.observer.Topic;
import com.byteflyer.designpatternforjava.observer.TopicSubscriber;

/**
 * 观察者涉及角色：
 * 1.抽象主题(subject)角色： 一般用一个抽象类或者接口实现，把所有对观察者对象的引用保存在一个List里，
 *   每个主题可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象。
 * 2.抽象观察(Observer)角色： 为所有具体的观察者定义一个接口，在得到主题通知时更新自己。
 * 3.具体主题(Concrete Subject)角色：将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知
 * 4.具体观察者(Concrete Observer)角色：实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。
 */

/**
 * 使用场景
 * 1.一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用
 * 2.一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体多少对象将发生改变，可以降低对象之间的耦合度。
 * 3.需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象等，可以使用观察者模式创建一种链式触发机制。
 */

/**
 * 优点：
 * ● 符合“开闭原则”要求
 * ● 解除耦合，让耦合双方都依赖于抽象，而不是依赖于具体。
 * ● 支持广播通讯，被观察者会向所有的登记过的观察者发送通知
 * 缺点：
 * ● 一个观察目标对象有很多直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
 * ● 观察者之间有循环依赖的话，被观察者会触发它们之间进行循环调用，导致系统崩溃
 * ●观察者的通知是通过另外的线程进行异步投递的话，系统必须保证投递是以自恰的方式进行的
 * ●观察者模式可以随时使观察者知道所观察的对象发生了变化，但是观察者模式没有相应的机制使观察者知道所观察的对象是怎么发生变化的
 */
public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        testTopic();
    }

    public void testTopic(){
        Topic topic = new Topic();
        TopicSubscriber sub1 = new TopicSubscriber("sub1");
        TopicSubscriber sub2 = new TopicSubscriber("sub2");
        TopicSubscriber sub3 = new TopicSubscriber("sub3");
        topic.attach(sub1);
        topic.attach(sub2);
        topic.attach(sub3);
        topic.notifyObserver("new sub1");
        topic.detach(sub2);
        topic.notifyObserver("new sub sub 111");
    }
}
