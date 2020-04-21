import {Component, OnInit} from '@angular/core';
import {UploadFunctionService} from 'src/app/upload-function.service';
import {MatTableDataSource} from '@angular/material/table';
import {Router} from '@angular/router';
import { ContentViewmodalComponent } from 'src/app/dialogues/content-viewmodal/content-viewmodal.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-table-view',
  templateUrl: './table-view.component.html',
  styleUrls: ['./table-view.component.css']
})
export class TableViewComponent implements OnInit {
  displayedColumns: string[];
  dataSource = new MatTableDataSource();

  constructor(private uploadservice: UploadFunctionService, private router: Router,private matDialog: MatDialog) {
  }

  ngOnInit(): void {
    this.displayedColumns = ['id', 'type', 'createdAt','fileName'];
    this.getUploadedScripts();
  }


  getUploadedScripts() {
    this.uploadservice.getAllScripts().subscribe((res: any) => {
      this.dataSource = res;

    }, err => {

    });
  }

  gotoHome() {
    this.router.navigate([`clfHome`]);
  }
  getRecord(row)
  {
  this.matDialog.open(ContentViewmodalComponent, { disableClose: true ,data: { content: row } });
   console.log(row)
   }
}
