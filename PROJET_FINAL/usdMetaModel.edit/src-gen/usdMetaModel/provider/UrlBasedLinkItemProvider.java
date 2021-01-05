/**
 */
package usdMetaModel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import usdMetaModel.UrlBasedLink;
import usdMetaModel.UsdMetaModelFactory;
import usdMetaModel.UsdMetaModelPackage;

/**
 * This is the item provider adapter for a {@link usdMetaModel.UrlBasedLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UrlBasedLinkItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlBasedLinkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUrlPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_UrlBasedLink_url_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UrlBasedLink_url_feature",
								"_UI_UrlBasedLink_type"),
						UsdMetaModelPackage.Literals.URL_BASED_LINK__URL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_UrlBasedLink_title_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UrlBasedLink_title_feature",
								"_UI_UrlBasedLink_type"),
						UsdMetaModelPackage.Literals.URL_BASED_LINK__TITLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UrlBasedLink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UrlBasedLink"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UrlBasedLink) object).getUrl();
		return label == null || label.length() == 0 ? getString("_UI_UrlBasedLink_type")
				: getString("_UI_UrlBasedLink_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UrlBasedLink.class)) {
		case UsdMetaModelPackage.URL_BASED_LINK__URL:
		case UsdMetaModelPackage.URL_BASED_LINK__TITLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case UsdMetaModelPackage.URL_BASED_LINK__SUBTEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT,
				UsdMetaModelFactory.eINSTANCE.createText()));

		newChildDescriptors.add(createChildParameter(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT,
				UsdMetaModelFactory.eINSTANCE.createStrong()));

		newChildDescriptors.add(createChildParameter(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT,
				UsdMetaModelFactory.eINSTANCE.createEmphasis()));

		newChildDescriptors.add(createChildParameter(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT,
				UsdMetaModelFactory.eINSTANCE.createLinkWithRef()));

		newChildDescriptors.add(createChildParameter(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT,
				UsdMetaModelFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT,
				UsdMetaModelFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(UsdMetaModelPackage.Literals.COMPOSITE_TEXT_ELEMENT__SUBTEXT,
				UsdMetaModelFactory.eINSTANCE.createButton()));
	}

}