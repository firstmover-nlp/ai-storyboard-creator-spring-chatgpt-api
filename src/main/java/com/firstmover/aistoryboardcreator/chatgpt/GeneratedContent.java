package com.firstmover.aistoryboardcreator.chatgpt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "generated_contents")
public class GeneratedContent {
    @Id
    private String id;
    private String scenario;
    private String imageUri;
}
