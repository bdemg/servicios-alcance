package com.uady.jorge_cano.serviciosatualcance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.uady.jorge_cano.serviciosatualcance.adapters.CommentListAdapter;
import com.uady.jorge_cano.serviciosatualcance.adapters.ServiceListAdapter;
import com.uady.jorge_cano.serviciosatualcance.model.Comment;
import com.uady.jorge_cano.serviciosatualcance.model.Professional;

public class WorkerDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_details);

        Professional worker = (Professional) getIntent().getSerializableExtra("professional");

        displayWorkerInfo(worker);
        displayComments();
    }

    private void displayWorkerInfo(Professional worker) {

        ((TextView)findViewById(R.id.worker_name)).setText(worker.getName());
        ((TextView)findViewById(R.id.worker_address)).setText(worker.getAddress());
        ((TextView)findViewById(R.id.worker_email)).setText(worker.getEmail());
        ((TextView)findViewById(R.id.worker_phone)).setText(worker.getPhoneNumber());
        ((TextView)findViewById(R.id.worker_distance)).setText("a " + worker.getDistanceFromUser() + " km de su posición");
        displayServices(worker.getServices());
    }

    public void callTelephone(View view) {

        String phonenumber = (String) ((TextView) findViewById(R.id.worker_phone)).getText();

        String uri = "tel:" + phonenumber.trim() ;
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    public void sendEmail(View view) {

        String email = (String) ((TextView) findViewById(R.id.worker_email)).getText();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL  , new String[]{email});
        intent.putExtra(Intent.EXTRA_SUBJECT, "");
        intent.putExtra(Intent.EXTRA_TEXT   , "");

        try {
            startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }

    private void displayComments() {

        Comment[] comments = new Comment[3];
        comments[0] = new Comment("Jose José",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc dolor lacus, laoreet et pellentesque a, finibus hendrerit tortor. Proin eget congue diam.",
                (float) 3.5);
        comments[1] = new Comment("Carlos Alberto",
                "Vestibulum semper, nulla ac blandit commodo, lectus est tempus ligula, vitae convallis mauris quam vitae ex. Maecenas tempor vel nisl id commodo. Nam massa ante, finibus vel orci at, eleifend congue dui. Proin id convallis nisl, vel tempus leo. Aenean sit amet eros sem.",
                (float) 4.5);
        comments[2] = new Comment("Hert Camacho",
                "Etiam eu odio placerat, ultricies ex non, tincidunt ex. Proin dolor arcu, scelerisque in ante id, eleifend rutrum massa. Nulla aliquet luctus auctor. Nunc quam est, luctus eget risus in, commodo viverra lorem. Curabitur vel diam ac tortor blandit fermentum. Nam porttitor rutrum arcu, ut ornare leo rutrum ac.",
                (float) 5);

        ListView commentList = (ListView) findViewById(R.id.comments_list);
        commentList.setAdapter(new CommentListAdapter(this, R.layout.comment_list_item, comments));
        setListViewHeightBasedOnChildren(commentList);
    }

    private void displayServices(String[] services) {

        ListView serviceList = (ListView) findViewById(R.id.service_list);
        serviceList.setAdapter(new ServiceListAdapter(this, R.layout.service_list_item, services));
        setListViewHeightBasedOnChildren(serviceList);
    }

    //**** Method for Setting the Height of the ListView dynamically.
    //**** Hack to fix the issue of not showing all the items of the ListView
    //**** when placed inside a ScrollView  ****/
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null)
            return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }
}
