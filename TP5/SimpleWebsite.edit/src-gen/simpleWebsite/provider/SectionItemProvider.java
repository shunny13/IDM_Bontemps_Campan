/**
 */
package simpleWebsite.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import simpleWebsite.Section;
import simpleWebsite.SimpleWebsiteFactory;
import simpleWebsite.SimpleWebsitePackage;

/**
 * This is the item provider adapter for a {@link simpleWebsite.Section} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SectionItemProvider extends ContentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION);
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
	 * This returns Section.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Section"));
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
		String label = ((Section) object).getID();
		return label == null || label.length() == 0 ? getString("_UI_Section_type")
				: getString("_UI_Section_type") + " " + label;
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

		switch (notification.getFeatureID(Section.class)) {
		case SimpleWebsitePackage.SECTION__CONTENT_INSIDE_SECTION:
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

		newChildDescriptors.add(createChildParameter(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION,
				SimpleWebsiteFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION,
				SimpleWebsiteFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add(createChildParameter(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION,
				SimpleWebsiteFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION,
				SimpleWebsiteFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION,
				SimpleWebsiteFactory.eINSTANCE.createSection()));

		newChildDescriptors.add(createChildParameter(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION,
				SimpleWebsiteFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(SimpleWebsitePackage.Literals.SECTION__CONTENT_INSIDE_SECTION,
				SimpleWebsiteFactory.eINSTANCE.createScript()));
	}

}
