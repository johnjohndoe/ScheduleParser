package info.metadude.android.schedule.parser.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import java.util.List;

import info.metadude.android.library.schedule.parser.ApiModule;
import info.metadude.android.library.schedule.parser.ScheduleService;
import info.metadude.android.library.schedule.parser.model.Datum;
import info.metadude.android.library.schedule.parser.model.SessionsResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class DemoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        loadData();
    }

    private void loadData() {
        ScheduleService scheduleService = ApiModule.getScheduleService();
        scheduleService.getSessionsResponse(new Callback<SessionsResponse>() {
            @Override
            public void success(SessionsResponse sessionsResponse, Response response) {
                List<Datum> data = sessionsResponse.getData();
                for (Datum datum : data) {
                    Log.d(getClass().getName(), datum.getId() + " -- " + datum.getTitle());
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(getClass().getName(), "Error = " + error);
            }
        });
    }

}
