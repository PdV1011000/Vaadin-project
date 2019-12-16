package com.gmail.stein.app.security;

import com.gmail.stein.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
