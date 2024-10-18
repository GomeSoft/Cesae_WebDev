<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class userController extends Controller
{
    public function users(){
        return view('users.all_users');
    }

    public function addUsers(){
        return view('users.addUser');
    }

    
}
