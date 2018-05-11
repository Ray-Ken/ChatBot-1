package com.example.viswa.chatbot.Models;

/**
 * Created by viswa on 22-02-2018.
 */

public class simsimiModel {
    public String response;
    public String id;
    public String message;
    public int result;

    public simsimiModel(String response, String id, String message, int result) {
        this.response = response;
        this.id = id;
        this.message = message;
        this.result = result;
    }

    public simsimiModel() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
