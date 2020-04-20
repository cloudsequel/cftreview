import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams, HttpResponse,} from '@angular/common/http';
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class UploadFunctionService {
  getAllScripts(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/clf/getAllScripts')
  }

  constructor(private http: HttpClient) {
  }


  fileUpload(jsonObj,fileName): Observable<any> {
    // let httpBody = new HttpParams();
    
    let httpHeaders = new HttpHeaders({
      'Content-Type': 'application/json',
      'Cache-Control': 'no-cache,no-store',
      'Pragma': 'no-cache'
    });
    let options = {
      headers: httpHeaders
    };
    return this.http.post<any>('http://localhost:8080/clf/validate?fileName='+fileName, jsonObj, options)

  }
}
