package com.zepto.user.def.exception;

// User Defined OR Biz exception 
public class UserAlreadyExistsException extends RuntimeException 
{

	public UserAlreadyExistsException(String _message)
	{
		super(_message);
	}
}
