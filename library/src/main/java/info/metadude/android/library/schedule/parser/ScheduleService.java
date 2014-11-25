package info.metadude.android.library.schedule.parser;

import info.metadude.android.library.schedule.parser.model.SessionsResponse;
import retrofit.Callback;
import retrofit.http.GET;

public interface ScheduleService {

    @GET("/30c3/sessions")
    public void getSessionsResponse(Callback<SessionsResponse> sessionsResponseCallback);

}
