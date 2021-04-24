package uts.i18090115.ichsan.activity.login

import uts.i18090115.ichsan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}