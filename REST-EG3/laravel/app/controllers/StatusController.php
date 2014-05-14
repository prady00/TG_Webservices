<?php

class StatusController extends BaseController {

	/**
	 * Returns json containing all status
	 *
	 * @return json 
	 */
	public function getStatus()
	{
		$statuses = Status::all();
		return $statuses;
	}
	
	/**
	 * Returns json
	 * 
	 * @return json
	 */
	public function addStatus()
	{
		$input = Input::json()->all();
	
		$status = new Status();
		
		$status->text = $input['status'];
		
		if($status->save()){

			return Response::json(array(
					'message'=>'added successfully',
			), 201);
			
		}else{
			
			return Response::json(array(
					'message'=>'stuck in some error'
			), 500);
			
		}
		
	}
	
	/**
	 * Returns json if status was deleted or not
	 *
	 * @return json
	 * @param id - status id which needs to be deleted
	 */
	public function deleteStatus($id)
	{
		$status = Status::find($id);
		
		if($status->delete()){
			return array('message'=>'deleted successfully');
		}else{
			
			return Response::json(array(
					'message'=>'stuck in some error'
			), 500);
			
		}
	}
	
}
