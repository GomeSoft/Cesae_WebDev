<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
    public function welcome(){
        return view('welcome');
        $myFirstVar = 'Hello World';
        $weekDays = $this->getAllWeekDays();
        return view('utils.home', compact ('weekDays','myFirstVar'));
    } 
    public function home(){
        $myName = 'Eugénio';
        $myFirstVar = 'Hello World';
        $weekDays = $this->getAllWeekDays();
        $courseInfo = $this->getCourseInfo();
        $cesaeInfo = $this->getCesaeInfo();
        // dd($weekDays);

        return view('utils.home', compact ('myName','myFirstVar', 'weekDays', 'courseInfo', 'cesaeInfo'));
    } 

    public function returnViewAllUsers(){

        $cesaeInfo = $this->getCesaeInfo();
        return view('users.all_users', compact ('cesaeInfo'));
        
    }

    private function getAllWeekDays(){
        $weekDays = ['Segunda', 'Terça', 'Quarta','Quinta'];
        return $weekDays;
    }

    private function getCourseInfo(){
        $courseInfo = [
            'name' => 'Web&Mobile',
            'hours' => 950,
        ];

        //dd ($courseInfo);
        return $courseInfo;
    }

    private function getCesaeInfo(){
        $cesaeInfo = [
            'name' => 'Cesae',
            'address' => 'Rua Ciriaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt',
        ];
        return $cesaeInfo;
    }

    

}
