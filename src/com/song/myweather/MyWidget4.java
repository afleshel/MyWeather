package com.song.myweather; 

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/** 
 *  类说�?
 * @author  作�?�?song  
 * @version 创建时间�?013-9-16 上午10:10:14 
 */
public class MyWidget4 extends AppWidgetProvider{

	@Override
	public void onAppWidgetOptionsChanged(Context context,
			AppWidgetManager appWidgetManager, int appWidgetId,
			Bundle newOptions) {
		// TODO Auto-generated method stub
		super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId,
				newOptions);
	}

	//每次接收到广播都调用�?��
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		super.onReceive(context, intent);
	}

	//手动更新widget
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}

	//启动后台服务，获取数�?	@Override
	public void onEnabled(Context context) {
		// TODO Auto-generated method stub
		super.onEnabled(context);
	}

}
