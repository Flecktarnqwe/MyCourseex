package com.company.course.view.category;

import com.company.course.entity.Category;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "categories", layout = MainView.class)
@ViewController(id = "Category.list")
@ViewDescriptor(path = "category-list-view.xml")
@LookupComponent("categoriesDataGrid")
@DialogMode(width = "64em")
public class CategoryListView extends StandardListView<Category> {
}