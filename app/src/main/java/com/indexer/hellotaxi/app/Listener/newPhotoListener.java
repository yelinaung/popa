package com.indexer.hellotaxi.app.Listener;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.widget.ArrayAdapter;


/**
 * Created by yemonkyaw on 5/17/14.
 */
public class newPhotoListener implements View.OnClickListener {
    Activity mActivity;
    Uri mImageUri;
    private String selectedImagePath;

    public newPhotoListener(Activity activity) {
        mActivity = activity;

    }

    @Override
    public void onClick(View v) {

        AlertDialog.Builder builderSingle = new AlertDialog.Builder(mActivity);
        builderSingle.setIcon(android.R.drawable.ic_menu_camera);
        builderSingle.setTitle("Select Source");
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(mActivity, android.R.layout.simple_list_item_1);
        arrayAdapter.add("Capture via Camera");
        arrayAdapter.add("Gallery");
        builderSingle.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }
        );

        builderSingle.setAdapter(arrayAdapter,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (which == 0) {

                        } else if (which == 1) {
                        }

                        dialog.dismiss();
                    }
                }
        );
        builderSingle.show();
    }
}