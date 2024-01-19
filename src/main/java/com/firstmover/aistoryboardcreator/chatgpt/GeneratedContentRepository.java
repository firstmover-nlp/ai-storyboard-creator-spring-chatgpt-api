package com.firstmover.aistoryboardcreator.chatgpt;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GeneratedContentRepository extends MongoRepository<GeneratedContent, String> {
}

