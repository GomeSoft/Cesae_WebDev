<?php

namespace App\Http\Controllers;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Response;

class userController extends Controller
{
    public function addUser(){
        return view('users.add_users');
    }
    public function allUsers(){
        //$cesaeInfo = $this->getCesaeInfo();
        $users = $this -> getAllUsersFromDB();
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

    private function getAllUsersFromDB(){
        $users = Db::table('users')
                    //->whereNotNull('updated_at')
                    ->get();
 
        return $users;
    }

    public function insertUsers(){

        //nsert na 
        //DB::table('users')
        // ->insert([
        //     'name'=>'Eugenio',
        //     'email'=>'Eugeniogomesapplea@gmail.com',
        //     'password'=>'Eugenio'
        //]);

            //Update na BD
            // DB::table('users')
            // ->where('id', 4)
            // ->update([
            //     'name' => 'Rita'
            // ]);


            // Uptdate ou insert
            //ir a bd verificar  se tem um email registrado

        // DB::table('users')
        //     ->updateOrInsert(
        //         [
        //             'email' => 'eugeniogomesapplea@gmail.com',
        //             'password' =>'Eugenio',
                                    
        //         ],
        //         [
        //             'name' => 'Gomes',
        //             'updated_at' => now(),
        //             'nif' => '123456',
        //         ]
        //     );



        // DB::table('users')
        //     ->where('id', 10)
        //     ->delete();

            return Response::json('sucesso');
        }
}
 
