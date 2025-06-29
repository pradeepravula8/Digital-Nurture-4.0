package com.example;

public class MonitoringService {
    private ExternalApiService apiService;

    public MonitoringService(ExternalApiService apiService) {
        this.apiService = apiService;
    }

    public String monitor() {
        String first = apiService.getStatus();
        String second = apiService.getStatus();
        return "First: " + first + ", Second: " + second;
    }
}
