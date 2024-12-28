package com.company.course.view.incomingshipmentdetail;

import com.company.course.entity.IncomingShipmentDetail;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "incomingShipmentDetails", layout = MainView.class)
@ViewController(id = "IncomingShipmentDetail.list")
@ViewDescriptor(path = "incoming-shipment-detail-list-view.xml")
@LookupComponent("incomingShipmentDetailsDataGrid")
@DialogMode(width = "64em")
public class IncomingShipmentDetailListView extends StandardListView<IncomingShipmentDetail> {
}