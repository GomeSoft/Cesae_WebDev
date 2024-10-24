<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class userController extends Controller
{
    public function addUser(){
        return view('users.add_users');
    }
    public function allUsers(){
        //$cesaeInfo = $this->getCesaeInfo();
        $users = $this -> getAllUsersFromArray();
        //dd($users);
        return view('users.all_users', compact(/*'cesaeInfo'*/'users'));
    }
    protected function getAllUsersFromArray(){
        $users = [
            ['id' => 1, 'name' => 'Sara', 'phone' => '12345657'],
            ['id' => 2, 'name' => 'Eugenio', 'phone' => '7654321'],
            ['id' => 3, 'name' => 'Vegeta', 'phone' => '96343865']
        ];
        return $users;
    }
}
 
