package com.company.course.view.outgoingshipment;

import com.company.course.entity.OutgoingShipment;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "outgoingShipments", layout = MainView.class)
@ViewController(id = "OutgoingShipment.list")
@ViewDescriptor(path = "outgoing-shipment-list-view.xml")
@LookupComponent("outgoingShipmentsDataGrid")
@DialogMode(width = "64em")
public class OutgoingShipmentListView extends StandardListView<OutgoingShipment> {
}