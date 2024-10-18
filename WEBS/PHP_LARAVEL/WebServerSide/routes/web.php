<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\userController;
use App\Http\Controllers\IndexController;
Route::get('/', [IndexController::class, 'welcome'])->name('welcome');

Route::get('/home', [IndexController::class, 'home'])->name('homepage');

Route::get('/users', [userController::class, 'users'])->name('users.all');

Route::get('/hello_world/{name}', function($name){
    return '<h1>Hello '.$name.'</h1>';
});



//rota de fallback, onde o user vai quando clica numa rota que não registada
// Route::fallback(function(){
//     return "<a href=".route('homepage').">Estás perdido, volta aqui</a>";
// });
Route::fallback(function(){
    return view('utils.fallback');
});


//Exercicio 1
Route::get('/addUsers', [userController::class, 'addUsers'])->name ('users.add');


