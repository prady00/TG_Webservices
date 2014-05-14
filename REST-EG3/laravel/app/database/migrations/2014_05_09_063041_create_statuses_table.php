<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;

class CreateStatusesTable extends Migration {

	public function up()
	{
		Schema::create('statuses', function(Blueprint $table) {
			$table->increments('id');
			$table->string('text', 256);
			$table->timestamps();
		});
	}

	public function down()
	{
		Schema::drop('statuses');
	}
}