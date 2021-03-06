package dao;

import entity.User;
import exception.UserLoginAlreadyExistException;
import exception.UserShortLengthLoginException;
import exception.UserShortLengthPasswordException;

import java.io.IOException;

public interface UserRegisterLoginFacade
{
    boolean registerLogin(User user) throws UserLoginAlreadyExistException, UserShortLengthPasswordException, UserShortLengthLoginException, IOException;
    boolean loginUser(String login, String password) throws IOException;
}
