package com.manager.service;

import com.manager.exception.ChatException;
import com.manager.exception.ProjectException;
import com.manager.exception.UserException;
import com.manager.model.Message;

import java.util.List;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

