import { Component, OnInit } from '@angular/core';
import { UploadFunctionService } from 'src/app/upload-function.service';
import { MatTableDataSource } from '@angular/material/table';
import { Router } from '@angular/router';

@Component({
  selector: 'app-table-view',
  templateUrl: './table-view.component.html',
  styleUrls: ['./table-view.component.css']
})
export class TableViewComponent implements OnInit {
  displayedColumns: string[];
  dataSource =new MatTableDataSource();
  constructor(private uploadservice: UploadFunctionService,private router:Router) { }

  ngOnInit(): void {
    this.displayedColumns= ['id', 'type','createdAt']
    this.getUploadedScripts();
  }


  getUploadedScripts()
  {
    this.uploadservice.getAllScripts().subscribe((res: any) => {
      this.dataSource=res;

  },err=>
  {

  })
}

gotoHome()
{
  this.router.navigate([`clfHome`]);
}
}