package FactoryPattern;

import com.sun.org.apache.xpath.internal.operations.*;

import java.lang.String;
import java.util.ArrayList;
import java.util.Observer;

/**
 * chouchan
 * 观察者模式
 * 观察者模式就是一种“发布者-订阅者”的模式。有时也被称为“模型-视图”模式、
 * "源-监听者"模式。在这种模式中，由一个目标对象来管理所有依赖与它的观察者对象
 * 并且当这个目标对象自身发生改变时，会主动向它的观察者们发出通知。
 */
public class ObserverPattern {

    //主题接口
    public interface Subject{
        public void registerObserver(Observer o);
        public void removeObserver(Observer o);
        public void notifyAllObserver();
    }
    //观察者接口
    public interface Observer{
        public void update(Subject s);
    }
    //视频网站 实现Subject 接口
    public static class VideoSite implements Subject{
        // 观察者列表以及更新了得视频列表
        private ArrayList<Observer> userList;
        private ArrayList<String> videos;

        public VideoSite(){
            userList = new ArrayList<Observer>();
            videos = new ArrayList<String>();
        }

        @Override
        public void registerObserver(Observer o) {
            userList.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            userList.remove(o);
        }

        @Override
        public void notifyAllObserver() {
            for (Observer o:userList){
                o.update(this);
            }
        }
        public void addVideos(String video){
            this.videos.add(video);
            notifyAllObserver();
        }
        public ArrayList<String> getVideos(){
            return videos;
        }

        public String toString(){
            return videos.toString();
        }
    }
    // 实现观察者，即看视频的美剧迷们
    public static class VideoFans implements Observer{

        private String name;

        public VideoFans(String name){
            this.name = name;
        }

        @Override
        public void update(Subject s) {
            System.out.println(this.name+",new videos are available！");
            System.out.println(s);
        }

        public static void main(String[] args) {
            VideoSite vs = new VideoSite();
            vs.registerObserver(new VideoFans("LiLei"));
            vs.registerObserver(new VideoFans("HanMeimei"));
            vs.registerObserver(new VideoFans("XiaoMing"));

            // add videos
            vs.addVideos("Video 1");
            //vs.addVideos("Video 2");
        }
    }






















}
