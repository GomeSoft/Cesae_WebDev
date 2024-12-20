<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::table('users', function (Blueprint $table) {
            //
            //$table->string('nif')->nullable(); - pode ser assim
            $table->string('nif')->default('Não existe nada!')->after('email');
            $table->string('adress')->nullable()->after('nif');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::table('users', function (Blueprint $table) {
            //
            $table->dropColumn('address');
            $table->dropColumn('nif');
        });
    }
};
