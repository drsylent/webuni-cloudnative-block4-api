package hu.webuni.cloud.api.dto;

import java.util.List;

public record TrainingResponse(List<String> recentMessages, int result) {
}
