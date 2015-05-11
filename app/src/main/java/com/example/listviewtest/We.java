package com.example.listviewtest;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by rainytunes on 4/20/15.
 */
public class We {

    private static int logcat_num = 0;
    private static int toast_num = 0;

    public static void logcat(){
        logcat("");
    }
    public static void logcat(String s){
        Log.w("<We.Can>","    <" + logcat_num + ">    " + s);
        logcat_num++;
    }


    public static void toast(Context context){
        toast(context,"");
    }
    public static void toast(Context context,String s){
        Toast.makeText(context,"    <" + toast_num + ">    " + s,Toast.LENGTH_SHORT).show();
    }
    public static void postToast(Context context,String s){
        Toast.makeText(context,s+" ",Toast.LENGTH_SHORT).show();
    }


    public static void showPic(ImageView imageView,int resId,int reqWidth,int reqHeight){
        imageView.setImageBitmap(decodeSampleBitmapFromResource(imageView.getResources(), resId, reqWidth, reqHeight));
    }
    public static void showPicFullScreen(ImageView imageView,int resId,WindowManager windowManger){
        DisplayMetrics dm = new DisplayMetrics();
        windowManger.getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;
        showPic(imageView,resId,screenWidth,screenHeight);
    }


    private static int calculateInSmapleSize(BitmapFactory.Options options,int reqWidth,int reqHeight){
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;
        if(height > reqHeight || width > reqWidth){
            final int heightRatio = Math.round((float)height / (float)reqHeight);
            final int widthRatio = Math.round((float)width / (float)reqWidth);
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        return inSampleSize;
    }
    private static Bitmap decodeSampleBitmapFromResource(Resources res,int resId,int reqWidth,int reqHeight){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res,resId,options);
        options.inSampleSize = calculateInSmapleSize(options,reqWidth,reqHeight);
        options.inJustDecodeBounds = false;
        return  BitmapFactory.decodeResource(res,resId,options);
    }
}
