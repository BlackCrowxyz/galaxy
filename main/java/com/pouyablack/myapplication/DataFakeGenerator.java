package com.pouyablack.myapplication;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import java.util.ArrayList;
import java.util.List;

public class DataFakeGenerator {
//    public static List<Items> getData(Context context){
//        List<Items> contents = new ArrayList<>();
//        for (int i = 0; i<9; i++) {
//            Items item = new Items();
//            item.setContentId(i);
//            switch (i){
//                case 0:
//                    item.setText("خورشید");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sun,null)); //Good for old devices
//                    break;
//                case 1:
//                    item.setText("عطارد");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.mercury,null)); //Good for old devices
//                    break;
//                case 2:
//                    item.setText("زهره");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.venus,null)); //Good for old devices
//                    break;
//                case 3:
//                    item.setText("زمین");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.earth,null)); //Good for old devices
//                    break;
//                case 4:
//                    item.setText("مریخ");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.mars,null)); //Good for old devices
//                    break;
//                case 5:
//                    item.setText("مشتری");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.jupiter,null)); //Good for old devices
//                    break;
//                case 6:
//                    item.setText("زحل");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.saturn,null)); //Good for old devices
//                    break;
//                case 7:
//                    item.setText("اورانوس");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.uranus,null)); //Good for old devices
//                    break;
//                case 8:
//                    item.setText("نپتون");
//                    item.setContentImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.neptun,null)); //Good for old devices
//                    break;
//                    //TODO: complete it ...
//            }
//            contents.add(item);
//        }
//        return contents;
//    }

    public static List<Items> getAppFeatures(Context context){
        List<Items> appFeatures=new ArrayList<>();

        Items appFeature=new Items();
        appFeature.setContentId(Items.ID_SUN);
        appFeature.setText("خورشید");
        appFeature.setFeatureImage(R.drawable.sun);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_MERCURY);
        appFeature.setText("عطارد");
        appFeature.setFeatureImage(R.drawable.mercury);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_VENUS);
        appFeature.setText("زهره");
        appFeature.setFeatureImage(R.drawable.venus);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_EARTH);
        appFeature.setText("زمین");
        appFeature.setFeatureImage(R.drawable.earth);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_MARS);
        appFeature.setText("مریخ");
        appFeature.setFeatureImage(R.drawable.mars);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_JUPITER);
        appFeature.setText("مشتری");
        appFeature.setFeatureImage(R.drawable.jupiter);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_SATURN);
        appFeature.setText("زحل");
        appFeature.setFeatureImage(R.drawable.saturn);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_URANUS);
        appFeature.setText("اورانوس");
        appFeature.setFeatureImage(R.drawable.uranus);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        appFeature=new Items();
        appFeature.setContentId(Items.ID_NEPTUN);
        appFeature.setText("نپتون");
        appFeature.setFeatureImage(R.drawable.neptun);
        appFeature.setDestinationActivity(CodingPage.class);
        appFeatures.add(appFeature);

        return appFeatures;
    }
}
