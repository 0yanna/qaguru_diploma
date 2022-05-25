package voiso.tests.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EmailDataModels {

    private String email;
    private String domain;
    private String user;
    private String full_name;
    private String state;

    public String getEmail() {
        return email;
    }

    public String getDomain() {
        return domain;
    }

    public String getUser() {
        return user;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getState() {
        return state;
    }
}
