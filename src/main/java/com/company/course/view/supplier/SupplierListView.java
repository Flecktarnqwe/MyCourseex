package com.company.course.view.supplier;

import com.company.course.entity.Supplier;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "suppliers", layout = MainView.class)
@ViewController(id = "Supplier.list")
@ViewDescriptor(path = "supplier-list-view.xml")
@LookupComponent("suppliersDataGrid")
@DialogMode(width = "64em")
public class SupplierListView extends StandardListView<Supplier> {
}