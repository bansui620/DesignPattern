package principle;

//单一职责原则
public class SRPTest {

    public static void main(String[] args) {

        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");

    }
}

class LiveCourse{
    public void study(String courseName){
        System.out.println(courseName+"不能快进看");
    }
}

class ReplayCourse{
    public void study(String courseName){
        System.out.println(courseName+"可以反复看");
    }
}
