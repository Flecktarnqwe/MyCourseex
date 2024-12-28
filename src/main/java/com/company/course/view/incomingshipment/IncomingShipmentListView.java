package com.company.course.view.incomingshipment;

import com.company.course.entity.IncomingShipment;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "incomingShipments", layout = MainView.class)
@ViewController(id = "IncomingShipment.list")
@ViewDescriptor(path = "incoming-shipment-list-view.xml")
@LookupComponent("incomingShipmentsDataGrid")
@DialogMode(width = "64em")
public class IncomingShipmentListView extends StandardListView<IncomingShipment> {
}