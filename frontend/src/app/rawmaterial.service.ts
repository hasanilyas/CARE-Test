import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'

@Injectable()
export class RawmaterialService {

  constructor(private http:HttpClient) {
  }
 
  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/rawmaterials');
  }

  deleteRawmaterial(rawmaterial: string){  
    return this.http.delete('//localhost:8080/rawmaterials/delete/' + rawmaterial);
  }

  addRawmaterial(formdata : any): Observable<any>{
    let result: Observable<Object>
    result=this.http.post('//localHost:8080/rawmaterials/add', formdata);
    return result
  }
 
}
