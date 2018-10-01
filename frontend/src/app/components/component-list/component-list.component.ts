import { Component, OnInit } from '@angular/core';
import { ComponentsService } from '../../components.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-component-list',
  templateUrl: './component-list.component.html',
  styleUrls: ['./component-list.component.css']
})
export class ComponentListComponent implements OnInit {

  components: Array<any>;
  
  constructor(private  componentsService: ComponentsService, private router: Router) { }
 
  ngOnInit() {
    this.componentsService.getAll().subscribe(data =>{
      this.components = data;
    });
  }

  deleteComponent(component){
    
    this.componentsService.deleteComponent(component).subscribe(result =>{
      this.router.navigate(['/components/add']);
    }, error => console.error(error))
  }

  componenteDetails(component){
    
  }

}
 