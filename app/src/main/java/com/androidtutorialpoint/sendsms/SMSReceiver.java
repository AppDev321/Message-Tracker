package com.androidtutorialpoint.sendsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by Administrator on 5/24/2017.
 */

public class SMSReceiver extends BroadcastReceiver {
    String origin;
    String body;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")){

          /*  Bundle extras = intent.getExtras();
            Object[] pdus = (Object[]) extras.get("pdus");
            for (Object pdu : pdus) {
                SmsMessage msg = SmsMessage.createFromPdu((byte[]) pdu);
                origin = msg.getOriginatingAddress();
                body = msg.getMessageBody();

            }
            Toast.makeText(context,"Message Recive:"+body +" -> "+origin,Toast.LENGTH_SHORT).show();
*/
            //do something with the received sms
        }else  if(intent.getAction().equals("android.provider.Telephony.SMS_SENT")){
            //do something with the sended sms

        }
    }
}
